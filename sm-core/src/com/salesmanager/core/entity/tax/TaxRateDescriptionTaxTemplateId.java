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
package com.salesmanager.core.entity.tax;

// Generated Sep 4, 2008 8:23:32 PM by Hibernate Tools 3.2.0.beta8

/**
 * TaxRatesDescriptionTaxTemplateId generated by hbm2java
 */
public class TaxRateDescriptionTaxTemplateId implements java.io.Serializable {

	// Fields

	private long taxRateId;

	private int languageId;

	// Constructors

	/** default constructor */
	public TaxRateDescriptionTaxTemplateId() {
	}

	/** full constructor */
	public TaxRateDescriptionTaxTemplateId(long taxRateId, int languageId) {
		this.taxRateId = taxRateId;
		this.languageId = languageId;
	}

	// Property accessors
	public long getTaxRateId() {
		return this.taxRateId;
	}

	public void setTaxRateId(long taxRateId) {
		this.taxRateId = taxRateId;
	}

	public int getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + languageId;
		result = PRIME * result + (int) (taxRateId ^ (taxRateId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final TaxRateDescriptionTaxTemplateId other = (TaxRateDescriptionTaxTemplateId) obj;
		if (languageId != other.languageId)
			return false;
		if (taxRateId != other.taxRateId)
			return false;
		return true;
	}

}
