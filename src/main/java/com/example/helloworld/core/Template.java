package com.example.helloworld.core;

import com.codahale.metrics.*;
import com.yammer.metrics.core.TimerContext;

import java.util.Optional;

import static java.lang.String.format;

public class Template {
    private MetricRegistry metricRegistry = SharedMetricRegistries.getOrCreate("default");
    private Counter templateRendersCounter = metricRegistry.counter("template-renders");
    private Meter templateRenderMeter = metricRegistry.meter("template-renders-meter");

    private final String content;
    private final String defaultName;

    public Template(String content, String defaultName) {
        this.content = content;
        this.defaultName = defaultName;
    }

    public String render(Optional<String> name) {
        templateRendersCounter.inc();
        templateRenderMeter.mark();
        return format(content, name.orElse(defaultName));
    }
}
