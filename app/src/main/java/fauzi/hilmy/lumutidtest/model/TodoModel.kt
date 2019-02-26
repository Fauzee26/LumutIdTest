package fauzi.hilmy.lumutidtest.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class TodoModel(

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("completed")
	val completed: Boolean? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("userId")
	val userId: Int? = null
) : Serializable {
	override fun toString(): String {
		return title ?: "-"
	}
}