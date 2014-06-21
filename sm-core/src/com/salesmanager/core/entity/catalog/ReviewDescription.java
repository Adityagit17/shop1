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

// Generated Nov 11, 2009 9:19:10 AM by Hibernate Tools 3.2.4.GA

/**
 * ReviewsDescription generated by hbm2java
 */
public class ReviewDescription implements java.io.Serializable {

	private ReviewDescriptionId id;
	private String reviewText;
	private Review review;

	public Review getReview() {
		return review;
	}

	public void setReview(Review review) {
		this.review = review;
	}

	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}

	public ReviewDescription() {
	}

	public ReviewDescription(ReviewDescriptionId id, String reviewText) {
		this.id = id;
		this.reviewText = reviewText;
	}

	public ReviewDescriptionId getId() {
		return this.id;
	}

	public void setId(ReviewDescriptionId id) {
		this.id = id;
	}

	public String getReviewText() {
		return this.reviewText;
	}

}
