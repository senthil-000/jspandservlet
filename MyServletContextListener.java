
package com.example.web;

import javax.servlet.*;

public class MyServletContextListener implements MyServletContextListener {


    public void contextInitialized(ServletContextEvent event){

        Servletcontext sc = event.getServletContext();

        String sellerName = sc.getInitParameter("sellername");

        SellerName sn = new SellerName(sellerName);

        sc.setAttribute("sellername",sn);
    }

    
}
