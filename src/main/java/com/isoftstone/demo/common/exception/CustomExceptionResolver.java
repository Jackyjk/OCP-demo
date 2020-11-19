package com.isoftstone.demo.common.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * �Զ����쳣������
 * @author issuser
 *
 */
public class CustomExceptionResolver implements HandlerExceptionResolver {
	
	/**
	 * һ�����������κ��쳣��ֻҪ��û�б�����ģ�ͨͨ���ᵽ����������һ��ͳһ����
	 */
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		//�ж��쳣�Ƿ���CustomerException
		ProductException pex = null;
		if(ex instanceof ProductException){
			pex = (ProductException)ex;
		}else {
		    //����׳��Ĳ���ϵͳ�Զ����쳣�����¹���һ��ϵͳ�����쳣��
		    pex = new ProductException("ϵͳ��������ϵͳ����Ա��ϵ��");
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", pex.getMessage());
		modelAndView.setViewName("error");
		//ϵͳ��ת���������������
		return modelAndView;
	}
}
