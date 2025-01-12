package com.dstore.expensetracker.ui.pages.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dstore.expensetracker.R
import com.dstore.expensetracker.ui.components.PrimaryButton
import com.dstore.expensetracker.ui.components.SecondaryButton

@Composable
fun OnboardingScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(30.dp)) {
        OnboardingSlider()
        PrimaryButton(
            modifier = Modifier.fillMaxWidth(),
            text = "Login",
            onClick = { /*TODO*/ },
            enabled = true,
            loading = false
        )
        SecondaryButton(
            modifier = Modifier.fillMaxWidth(),
            text = "Export",
            onClick = { /*TODO*/ },
            enabled = true,
            loading = false
        )
    }
}

@Composable
fun OnboardingSlider() {
    val imgId = R.drawable.onboarding_1
    val title = "Gain total control of your money"
    val subtitle = "Become your own money manager and make every cent count"
    OnboardingCard(modifier = Modifier.padding(50.dp),imgId, title, subtitle)
}

@Composable
fun OnboardingCard(modifier: Modifier, imgId: Int, title: String, subtitle: String) {
    Image(painter = painterResource(imgId), "")
    Column (modifier = modifier) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleLarge,
            textAlign = TextAlign.Center,
        )
        Text(text = subtitle)
    }
}


@Preview(showBackground = true, showSystemUi = true, name = "Onboarding")
@Composable
fun OnboardingPreview() {
    OnboardingScreen()
}
