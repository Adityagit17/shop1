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
package com.salesmanager.core.entity.reference;

// Generated Oct 4, 2007 1:55:26 PM by Hibernate Tools 3.2.0.b9

import java.util.Date;
import java.util.Locale;

import com.salesmanager.core.entity.common.I18NEntity;
import com.salesmanager.core.util.LabelUtil;

/**
 * CentralMeasureUnits generated by hbm2java
 */
public class CentralMeasureUnits implements java.io.Serializable, I18NEntity {

	private int centralMeasureUnitsId;
	private int centralMeasureUnitsType;
	private String centralMeasureUnitsCode;

	// specific fields
	private Locale locale;
	private String description;

	private Date dateAdded;

	public CentralMeasureUnits() {
	}

	public CentralMeasureUnits(int centralMeasureUnitsId,
			int centralMeasureUnitsType, String centralMeasureUnitsCode,
			Date dateAdded) {
		this.centralMeasureUnitsId = centralMeasureUnitsId;
		this.centralMeasureUnitsType = centralMeasureUnitsType;
		this.centralMeasureUnitsCode = centralMeasureUnitsCode;
		this.dateAdded = dateAdded;
	}

	public int getCentralMeasureUnitsId() {
		return this.centralMeasureUnitsId;
	}

	public void setCentralMeasureUnitsId(int centralMeasureUnitsId) {
		this.centralMeasureUnitsId = centralMeasureUnitsId;
	}

	public int getCentralMeasureUnitsType() {
		return this.centralMeasureUnitsType;
	}

	public void setCentralMeasureUnitsType(int centralMeasureUnitsType) {
		this.centralMeasureUnitsType = centralMeasureUnitsType;
	}

	public String getCentralMeasureUnitsCode() {
		return this.centralMeasureUnitsCode;
	}

	public void setCentralMeasureUnitsCode(String centralMeasureUnitsCode) {
		this.centralMeasureUnitsCode = centralMeasureUnitsCode;
	}

	public Date getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public String getDescription() {

		String desc = "";
		StringBuffer code = new StringBuffer();
		code.append("label.store.units.").append(
				getCentralMeasureUnitsCode().trim());
		if (this.getLocale() != null) {
			desc = LabelUtil.getInstance().getText(this.getLocale(),
					code.toString());
		} else {
			desc = LabelUtil.getInstance().getText(
					"label.store.units." + this.getCentralMeasureUnitsCode());
		}
		return desc;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	public void setLocale(Locale locale, String currency) {
		this.locale = locale;
	}

}
