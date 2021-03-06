package edu.olivet.se530.modules;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

import edu.olivet.se530.HtmlCrawler;
import edu.olivet.se530.HtmlCrawlerImpl;
import edu.olivet.se530.annotations.SaveHtml;
import edu.olivet.se530.aop.SaveHtmlInterceptor;

public class CrawlerModule extends AbstractModule {

	@Override
	protected void configure() {
		this.bind(HtmlCrawler.class).to(HtmlCrawlerImpl.class);
		
		SaveHtmlInterceptor interceptor = new SaveHtmlInterceptor();
		this.requestInjection(interceptor);
		this.bindInterceptor(Matchers.any(), Matchers.annotatedWith(SaveHtml.class), interceptor);
	}

}
