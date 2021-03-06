
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
class QueryWithFragmentConditionalQuery(var getName: Boolean): Query<QueryWithFragmentConditionalResponse> {

    val rawQueryString = "fragment FragmentWithConditional on Shop { __typename name @include(if: \$getName) } query QueryWithFragmentConditional(\$getName: Boolean!) { __typename shop { __typename id ... FragmentWithConditional } }"

    override fun decodeResponse(jsonObject: JsonObject): QueryWithFragmentConditionalResponse {
        return QueryWithFragmentConditionalResponse(jsonObject)
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
        "getName" to "$getName"
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
selections = listOf<Selection>())) + FragmentWithConditional.getSelections(operationVariables).map { it.copy(typeCondition = "Shop") }))
}
