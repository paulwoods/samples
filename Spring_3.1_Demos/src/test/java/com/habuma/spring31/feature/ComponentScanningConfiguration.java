package com.habuma.spring31.feature;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.habuma.spring31.feature.stuff")
public class ComponentScanningConfiguration extends BaseConfiguration {
}
