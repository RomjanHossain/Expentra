package com.dstore.expensetracker.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dstore.expensetracker.ui.theme.VIOLET_VIOLET_100
import com.dstore.expensetracker.ui.theme.VIOLET_VIOLET_20


@Composable
fun PrimaryButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    Button(
        modifier = modifier.height(50.dp),
        onClick = {
            if (enabled && !loading) onClick()
        }, // Correct usage of enabled and loading
        colors = ButtonDefaults.buttonColors(
            containerColor = VIOLET_VIOLET_100,
        )
    ) {
        if (loading) {
            LoadingIndicator()
        } else {
            Text(text = text)
        }
    }
}
@Composable
fun SecondaryButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit,
    enabled: Boolean = true,
    loading: Boolean = false,
) {
    Button(
        modifier = modifier.height(50.dp),
        onClick = {
            if (enabled && !loading) onClick()
        }, // Correct usage of enabled and loading
        colors = ButtonDefaults.buttonColors(
            containerColor = VIOLET_VIOLET_20,
            contentColor = VIOLET_VIOLET_100
        )
    ) {
        if (loading) {
            LoadingIndicator()
        } else {
            Text(text = text)
        }
    }
}



@Composable
fun LoadingIndicator() {
    CircularProgressIndicator()
}

@Preview(name = "Primary Buttons")
@Composable
fun SecondaryButton(){
    PrimaryButton(
        modifier = Modifier.fillMaxWidth(),
        text = "Login",
        onClick = { /*TODO*/ },
        enabled = true,
        loading = false
    )
}
