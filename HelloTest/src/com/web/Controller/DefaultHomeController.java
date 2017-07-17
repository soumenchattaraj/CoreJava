/**
 * 
 */
package com.web.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author SS
 * #  dated : 17-Jul-2017
 * # Default Home 
 *
 */
@Controller
public class DefaultHomeController {
	
	
	@RequestMapping(value="/defaultHome.s3",method=RequestMethod.GET)
	public ModelAndView defaultHome(HttpServletRequest request,HttpServletResponse response,ModelMap map)
	{
		return new ModelAndView("/DefaultHome");
	}

}
