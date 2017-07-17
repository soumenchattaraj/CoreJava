/**
 * 
 */
package com.chat.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author SS
 * #creation Date : 16-July-2017
 *
 */
@Controller
public class DefaultController {
	
	@RequestMapping(value="/home.s3",method=RequestMethod.GET)
	public ModelAndView defaultHome(HttpServletRequest request,HttpServletResponse response,ModelMap map)
	{
		return new ModelAndView("/defaultHome");
	}
	

}
