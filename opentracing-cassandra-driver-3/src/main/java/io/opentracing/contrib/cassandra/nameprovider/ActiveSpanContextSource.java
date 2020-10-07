package io.opentracing.contrib.cassandra.nameprovider;

import io.opentracing.SpanContext;

public interface ActiveSpanContextSource {
    /**
     * ActiveSpanContextSource implementation that always returns null as the active span context.
     */
    ActiveSpanContextSource NONE =
            new ActiveSpanContextSource() {
                @Override
                public SpanContext getActiveSpanContext() {
                    return null;
                }
            };

    /**
     * Retrieves the active {@link SpanContext}.
     *
     * @return the active span context
     */
    SpanContext getActiveSpanContext();
}
