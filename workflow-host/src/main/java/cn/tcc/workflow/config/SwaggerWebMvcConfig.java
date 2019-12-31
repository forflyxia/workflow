package cn.tcc.workflow.config;

import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.*;

import java.util.List;

public interface SwaggerWebMvcConfig extends WebMvcConfigurer {
    @Override
    default void configurePathMatch(PathMatchConfigurer pathMatchConfigurer) {

    }

    @Override
    default void configureContentNegotiation(ContentNegotiationConfigurer contentNegotiationConfigurer) {

    }

    @Override
    default void configureAsyncSupport(AsyncSupportConfigurer asyncSupportConfigurer) {

    }

    @Override
    default void configureDefaultServletHandling(DefaultServletHandlerConfigurer defaultServletHandlerConfigurer) {

    }

    @Override
    default void addFormatters(FormatterRegistry formatterRegistry) {

    }

    @Override
    default void addInterceptors(InterceptorRegistry interceptorRegistry) {

    }

    @Override
    default void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("doc.html").addResourceLocations("classpath:/META-INF/resources/");
    }

    @Override
    default void addCorsMappings(CorsRegistry corsRegistry) {

    }

    @Override
    default void addViewControllers(ViewControllerRegistry viewControllerRegistry) {

    }

    @Override
    default void configureViewResolvers(ViewResolverRegistry viewResolverRegistry) {

    }

    @Override
    default void addArgumentResolvers(List<HandlerMethodArgumentResolver> list) {

    }

    @Override
    default void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> list) {

    }

    @Override
    default void configureMessageConverters(List<HttpMessageConverter<?>> list) {

    }

    @Override
    default void extendMessageConverters(List<HttpMessageConverter<?>> list) {

    }

    @Override
    default void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> list) {

    }

    @Override
    default void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> list) {

    }

    @Override
    default Validator getValidator() {
        return null;
    }

    @Override
    default MessageCodesResolver getMessageCodesResolver() {
        return null;
    }
}
