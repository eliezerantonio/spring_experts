package com.stackcode.gestao.config.init;

import com.stackcode.gestao.config.JPAConfig;
import com.stackcode.gestao.config.WebConfig;
import javax.servlet.Filter;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        // TODO Auto-generated method stub
        return new Class<?>[]{JPAConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {

        return new Class<?>[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {

        return new String[]{"/"};
    }
//resolve problema se acentos

    @Override
    protected Filter[] getServletFilters() {

        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);

        return new Filter[]{characterEncodingFilter};
    }

}
