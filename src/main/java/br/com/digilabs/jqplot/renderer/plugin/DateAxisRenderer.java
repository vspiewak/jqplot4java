/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digilabs.jqplot.renderer.plugin;

import br.com.digilabs.jqplot.renderer.Renderer;
import br.com.digilabs.jqplot.util.JqPlotResources;

/**
 * Renderizador de um Date Axis
 * @author inaiat
 */
public class DateAxisRenderer implements Renderer {

    private static final long serialVersionUID = -6281926919874791228L;
    private Boolean sortMergedLabels;
    private Renderer tickRenderer;

    /**
     * @return the sortMergedLabels
     */
    public Boolean getSortMergedLabels() {
        return sortMergedLabels;
    }

    /**
     * @param sortMergedLabels the sortMergedLabels to set
     */
    public void setSortMergedLabels(Boolean sortMergedLabels) {
        this.sortMergedLabels = sortMergedLabels;
    }

    /**
     * @return the tickRenderer
     */
    public Renderer getTickRenderer() {
        return tickRenderer;
    }

    /**
     * @param tickRenderer the tickRenderer to set
     */
    public void setTickRenderer(Renderer tickRenderer) {
        this.tickRenderer = tickRenderer;
    }

    public JqPlotResources resource() {
        return JqPlotResources.DateAxisRenderer;
    }
}
