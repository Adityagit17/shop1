/*
 * Licensed to csti consulting 
 * You may obtain a copy of the License at
 *
 * http://www.csticonsulting.com
 * Copyright (c) 2006-Aug 24, 2010 Consultation CS-TI inc. 
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.salesmanager.core.service.workflow;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ProcessorContext implements Serializable {

	private Map objects = new HashMap();

	public void addObject(String key, Object o) {
		objects.put(key, o);
	}

	public Object getObject(String key) {
		if (objects.containsKey(key)) {
			return objects.get(key);
		}
		return null;
	}

	public void removeObject(String key) {
		if (objects.containsKey(key)) {
			objects.remove(key);
		}
	}

}
