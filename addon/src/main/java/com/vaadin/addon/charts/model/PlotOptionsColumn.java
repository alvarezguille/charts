package com.vaadin.addon.charts.model;

/*
 * #%L
 * Vaadin Charts
 * %%
 * Copyright (C) 2012 Vaadin Ltd
 * %%
 * This program is available under Commercial Vaadin Add-On License 2.0
 * (CVALv2).
 * 
 * See the file licensing.txt distributed with this software for more
 * information about licensing.
 * 
 * You should have received a copy of the CVALv2 along with this program.
 * If not, see <http://vaadin.com/license/cval-2.0>.
 * #L%
 */

/**
 * Plot options that are specific for ChartType.COLUMN charts
 */
@SuppressWarnings("serial")
public class PlotOptionsColumn extends AbstractPlotOptions {
    private Number pointPadding;
    private Number borderWidth;
    private Number groupPadding;

    /**
     * @see #setPointPadding(Number)
     * @return The padding between each column or bar. Returns null if not set.
     */
    public Number getPointPadding() {
        return pointPadding;
    }

    /**
     * Sets the padding between each column or bar, in x axis units. Defaults to
     * 0.1.
     * 
     * @param pointPadding
     */
    public void setPointPadding(Number pointPadding) {
        this.pointPadding = pointPadding;
    }

    /**
     * @see #setBorderWidth(Number)
     * @return The width of the border or null if not set
     */
    public Number getBorderWidth() {
        return borderWidth;
    }

    /**
     * Sets the width of the border surrounding each column or bar. Defaults to
     * 1.
     * 
     * @param borderWidth
     */
    public void setBorderWidth(Number borderWidth) {
        this.borderWidth = borderWidth;
    }

    /**
     * Sets the padding between each value group, in X-axis units. Defaults to
     * 0.2.
     * 
     * @param groupPadding
     */
    public void setGroupPadding(Number groupPadding) {
        this.groupPadding = groupPadding;
    }

    /**
     * @see #setGroupPadding(Number)
     * @return The padding between each value group.
     */
    public Number getGroupPadding() {
        return groupPadding;
    }

    @Override
    public ChartType getChartType() {
        return ChartType.COLUMN;
    }
}
