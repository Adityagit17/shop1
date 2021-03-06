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
package com.salesmanager.core.entity.catalog;

// Generated May 19, 2010 2:04:19 PM by Hibernate Tools 3.2.4.GA

/**
 * ProductsPriceDescription generated by hbm2java
 */
public class ProductPriceDescription implements java.io.Serializable {

	private ProductPriceDescriptionId id;
	private String productPriceName;
	private ProductPrice productPrice;

	public ProductPriceDescription() {
	}

	public ProductPriceDescription(ProductPriceDescriptionId id) {
		this.id = id;
	}

	public ProductPriceDescription(ProductPriceDescriptionId id,
			String productPriceName) {
		this.id = id;
		this.productPriceName = productPriceName;
	}

	public ProductPriceDescriptionId getId() {
		return this.id;
	}

	public void setId(ProductPriceDescriptionId id) {
		this.id = id;
	}

	public String getProductPriceName() {
		return productPriceName;
	}

	public void setProductPriceName(String productPriceName) {
		this.productPriceName = productPriceName;
	}

	public ProductPrice getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(ProductPrice productPrice) {
		this.productPrice = productPrice;
	}

}
