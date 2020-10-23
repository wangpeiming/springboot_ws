package com.wsyy.servlet;

import javax.servlet.annotation.WebServlet;

import org.apache.cxf.transport.servlet.CXFServlet;

@WebServlet(name="CXFService", loadOnStartup = 1, urlPatterns = "/services/*")
public class CxfServletInitializer extends CXFServlet{

}
