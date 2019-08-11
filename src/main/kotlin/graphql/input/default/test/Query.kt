package graphql.input.default.test

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class Query : GraphQLQueryResolver {

    fun list(listing: Listing): List<String> {
        return listOf("size: ${listing.size}", "after: ${listing.after}")
    }

}