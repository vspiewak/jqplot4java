/*
 *  Copyright 2011 Inaiat H. Moraes.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */
package br.com.digilabs.jqplot.data;

import br.com.digilabs.jqplot.data.item.BubbleItem;

import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;

/**
 * Data Helper to build Bubble Charts.
 *
 * @param <T> BubbleItem or something that extends BubbleItem.
 * @author inaiat
 */
public class BubbleData<T extends BubbleItem> extends AbstractCollectionData<T> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 5564319083971645500L;

	/** The data. */
	private Collection<T> data = new ArrayList<T>();

    /* (non-Javadoc)
     * @see br.com.digilabs.jqplot.data.ChartData#getData()
     */
    public Collection<T> getData() {
        return data;
    }

    /* (non-Javadoc)
     * @see br.com.digilabs.jqplot.data.ChartData#toJsonString()
     */
    public String toJsonString() {
        JSONArray outerArray = new JSONArray();
        JSONArray jsonArray = new JSONArray();
        for (BubbleItem item : data) {
            JSONArray itemArray = new JSONArray();
            itemArray.put(item.getX());
            itemArray.put(item.getY());
            itemArray.put(item.getRadius());
            itemArray.put(item.getLabel());
            jsonArray.put(itemArray);
        }
        outerArray.put(jsonArray);
        return outerArray.toString();
    }
}
