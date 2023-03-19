package com.github.joseluu.guice;

import com.github.joseluu.guice.service.GuiceService;
import com.github.joseluu.guice.service.impl.IService;
import com.google.inject.AbstractModule;

public class GuiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(IService.class).to(GuiceService.class);
    }
}
