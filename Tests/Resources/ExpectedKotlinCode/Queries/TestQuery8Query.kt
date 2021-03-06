
package com.shopify.syrup.queries

import com.shopify.foundation.syrupsupport.*
import com.google.gson.*
import java.math.BigDecimal
import org.joda.time.DateTime
import com.shopify.syrup.enums.*
import com.shopify.syrup.inputs.*
import com.shopify.syrup.fragments.*
import com.shopify.syrup.responses.*
import javax.annotation.Generated

@Generated("com.shopify.syrup")
class TestQuery8Query(): Query<TestQuery8Response> {

    val rawQueryString = "query TestQuery8 { __typename shop { __typename id firstProduct: products(first: 1) { __typename edges { __typename cursor node { __typename title } } } lastProduct: products(first: 1, reverse: true) { __typename edges { __typename cursor node { __typename title } } } } }"

    override fun decodeResponse(jsonObject: JsonObject): TestQuery8Response {
        return TestQuery8Response(jsonObject)
    }

    override fun getQueryString(): String {
        val gson = OperationGsonBuilder.gson
        var variables = gson.toJson(this)
        if (variables != "{}") {
            variables = setDefinedNulls(variables)
            return "{ \"query\": \"$rawQueryString\", \"variables\": $variables}"
        }
        return "{ \"query\": \"$rawQueryString\" }"
    }

    val operationVariables = mapOf<String, String>(
    )

    override val selections = listOf<Selection>(
Selection(
name = "shop",
type = "Shop",
cacheKey = "shop",
passedGID = null,
backingGIDReference = "id",
typeCondition = "QueryRoot",
shouldSkipBasedOnConditionalDirective = false,
selections = listOf<Selection>(
Selection(
name = "id",
type = "ID",
cacheKey = "id",
passedGID = null,
backingGIDReference = null,
typeCondition = "Shop",
shouldSkipBasedOnConditionalDirective = false,
selections = listOf<Selection>()), 
Selection(
name = "firstProduct",
type = "ProductConnection",
cacheKey = "firstProduct(first: 1)",
passedGID = null,
backingGIDReference = null,
typeCondition = "Shop",
shouldSkipBasedOnConditionalDirective = false,
selections = listOf<Selection>(
Selection(
name = "edges",
type = "ProductEdge",
cacheKey = "edges",
passedGID = null,
backingGIDReference = null,
typeCondition = "ProductConnection",
shouldSkipBasedOnConditionalDirective = false,
selections = listOf<Selection>(
Selection(
name = "cursor",
type = "String",
cacheKey = "cursor",
passedGID = null,
backingGIDReference = null,
typeCondition = "ProductEdge",
shouldSkipBasedOnConditionalDirective = false,
selections = listOf<Selection>()), 
Selection(
name = "node",
type = "Product",
cacheKey = "node",
passedGID = null,
backingGIDReference = null,
typeCondition = "ProductEdge",
shouldSkipBasedOnConditionalDirective = false,
selections = listOf<Selection>(
Selection(
name = "title",
type = "String",
cacheKey = "title",
passedGID = null,
backingGIDReference = null,
typeCondition = "Product",
shouldSkipBasedOnConditionalDirective = false,
selections = listOf<Selection>()))))))), 
Selection(
name = "lastProduct",
type = "ProductConnection",
cacheKey = "lastProduct(first: 1, reverse: true)",
passedGID = null,
backingGIDReference = null,
typeCondition = "Shop",
shouldSkipBasedOnConditionalDirective = false,
selections = listOf<Selection>(
Selection(
name = "edges",
type = "ProductEdge",
cacheKey = "edges",
passedGID = null,
backingGIDReference = null,
typeCondition = "ProductConnection",
shouldSkipBasedOnConditionalDirective = false,
selections = listOf<Selection>(
Selection(
name = "cursor",
type = "String",
cacheKey = "cursor",
passedGID = null,
backingGIDReference = null,
typeCondition = "ProductEdge",
shouldSkipBasedOnConditionalDirective = false,
selections = listOf<Selection>()), 
Selection(
name = "node",
type = "Product",
cacheKey = "node",
passedGID = null,
backingGIDReference = null,
typeCondition = "ProductEdge",
shouldSkipBasedOnConditionalDirective = false,
selections = listOf<Selection>(
Selection(
name = "title",
type = "String",
cacheKey = "title",
passedGID = null,
backingGIDReference = null,
typeCondition = "Product",
shouldSkipBasedOnConditionalDirective = false,
selections = listOf<Selection>()))))))))))
}
