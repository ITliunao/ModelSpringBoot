//查询老师要教授的班级和课程
select  g.gradename ,c.classname, co.coursename from clas_cour_teach cct 
left JOIN class c
on c.classid = cct.classid
left JOIN grade g
on g.gradeid = cct.gradeid
inner join teacher t
on t.num = cct.teacherid
left join course co
on co.courseid = cct.courseid
where t.`name`="cathy"



//查询学生各科成绩，以及负责教授此科目的老师
select s.name,co.coursename,t.name 'teacher',sco.scores
from 
(select cct.courseid ,cct.teacherid,s.num from clas_cour_teach cct 
INNER JOIN stu s
on s.classid = cct.classid and s.classid = cct.classid) info 
INNER JOIN course co
on info.courseid=co.courseid
left  join stu_cour_sco scs
on info.num = scs.stuid and info.courseid = scs.courseid
inner join stu s 
on info.num = s.num
inner join teacher t 
on info.teacherid = t.num
left join score sco
on sco.scoreid = scs.scoreid
where s.num = '001'



//查询1501级一班所有学生成绩（标明各科的成绩,按照学号排序）
select  s.num,GROUP_CONCAT(CONCAT(co.coursename,':',sco.scores)) score ,s.name from clas_cour_teach cct 
inner join stu s
on s.classid = cct.classid and s.gradeid = cct.gradeid
inner join stu_cour_sco scs
on scs.stuid = s.num and scs.courseid = cct.courseid
inner join score sco
on sco.scoreid = scs.scoreid
INNER JOIN course co
on cct.courseid = co.courseid
where cct.classid='001' and cct.gradeid='001'
GROUP BY s.num



//查询老师所要打分的课程以及对应的学生
select  s.num,sco.scores,s.name from clas_cour_teach cct 
inner join stu s
on s.classid = cct.classid and s.gradeid = cct.gradeid
inner join stu_cour_sco scs
on scs.stuid = s.num and scs.courseid = cct.courseid
inner join score sco
on sco.scoreid = scs.scoreid
INNER JOIN course co
on cct.courseid = co.courseid
where cct.classid='001' and cct.gradeid='001' and co.coursename in (select co.coursename from clas_cour_teach cct 
inner join teacher t
on t.num = cct.teacherid
left join course co
on co.courseid = cct.courseid
where t.`name`="cathy" and cct.gradeid='001' and cct.classid='001')

