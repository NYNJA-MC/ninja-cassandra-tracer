package io.opentracing.contrib.cassandra.nameprovider;

import io.opentracing.Span;

public interface ActiveSpanSource {

    ActiveSpanSource NONE =
            new ActiveSpanSource() {
                @Override
                public Span getActiveSpan() {
                    return null;
                }
            };

    /**
     * Retieves the active {@link Span}.
     *
     * @return the active span
     */
    Span getActiveSpan();
}
