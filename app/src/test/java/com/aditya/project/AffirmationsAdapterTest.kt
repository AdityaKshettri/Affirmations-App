package com.aditya.project

import android.content.Context
import com.aditya.project.adapter.ItemAdapter
import com.aditya.project.model.Affirmation
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class AffirmationsAdapterTest {

    private val context = mock(Context::class.java)

    @Test
    fun adapter_size() {
        // Given
        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )
        // When
        val adapter = ItemAdapter(context, data)
        // Then
        assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)
    }
}