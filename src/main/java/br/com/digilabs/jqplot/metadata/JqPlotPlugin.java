/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digilabs.jqplot.metadata;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import br.com.digilabs.jqplot.util.JqPlotResources;

/**
 * Representa o plugin para o jqplot
 * @author inaiat
 */
@Retention(RetentionPolicy.RUNTIME)
@Target( { ElementType.TYPE })
public @interface JqPlotPlugin {
    JqPlotResources[] values();
}
