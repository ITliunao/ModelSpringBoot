package com.zhengyuan.liunao.config;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zsl on 2017/9/3.
 */
@Configuration
public class ConfigurationFilter {
	@Bean
	public RemoteIpFilter remoteIpFilter() {
		return new RemoteIpFilter();
	}

	@Bean
	public FilterRegistrationBean testFilterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new MyFilter());// 添加过滤器
		registration.addUrlPatterns("/*");// 设置过滤路径，/*所有路径
		registration.addInitParameter("name", "alue");// 添加默认参数
		registration.setName("MyFilter");
		registration.setOrder(1);// 设置优先级
		return registration;
	}

	public class MyFilter implements Filter {
		@Override
		public void destroy() {
		}

		@Override
		public void doFilter(ServletRequest srequest, ServletResponse sresponse, FilterChain filterChain)
				throws IOException, ServletException {
			HttpServletRequest request = (HttpServletRequest) srequest;
			// 打印请求Url
			System.out.println("this is MyFilter,url :" + request.getRequestURI());
			filterChain.doFilter(srequest, sresponse);
		}

		@Override
		public void init(FilterConfig arg0) throws ServletException {
		}
	}
}