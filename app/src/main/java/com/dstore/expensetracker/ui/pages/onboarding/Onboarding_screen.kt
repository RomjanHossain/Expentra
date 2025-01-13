package com.dstore.expensetracker.ui.pages.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dstore.expensetracker.R
import com.dstore.expensetracker.ui.components.PrimaryButton
import com.dstore.expensetracker.ui.components.SecondaryButton
import com.dstore.expensetracker.ui.theme.VIOLET_VIOLET_100
import com.dstore.expensetracker.ui.theme.VIOLET_VIOLET_20
import kotlinx.coroutines.delay

@Composable
fun OnboardingScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(30.dp)
            .wrapContentSize(align = Alignment.Center),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        OnboardingSlider(
            Modifier
                .padding(20.dp)
                .fillMaxHeight(0.3f)

        )
        PrimaryButton(
            modifier = Modifier.fillMaxWidth(),
            text = "Login",
            onClick = { /*TODO*/ },
            enabled = true,
            loading = false
        )
        Spacer(modifier = Modifier.height(15.dp))
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
fun OnboardingSlider(modifier: Modifier) {

    var currentIndex by remember { mutableIntStateOf(0) }
    LaunchedEffect(Unit) {
        while (true) {
            delay(3000L)
            currentIndex = (currentIndex + 1) % 3
        }
    }

    OnboardingCard(modifier = modifier, currentIndex)
}

@Composable
fun OnboardingCard(modifier: Modifier, curr: Int) {
    val titleList =
        listOf(R.string.onboardingTitle1, R.string.onboardingTitle2, R.string.onboardingTitle3)
    val subtitleList = listOf(
        R.string.onboardingSubtitle1,
        R.string.onboardingSubtitle2,
        R.string.onboardingSubtitle3
    )
    val imgList =
        listOf(R.drawable.onboarding_1, R.drawable.onboarding_2, R.drawable.onboarding_plan)

    Image(painter = painterResource(imgList[curr]), stringResource(titleList[curr]))
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = stringResource(titleList[curr]),
            style = MaterialTheme.typography.titleLarge,
            textAlign = TextAlign.Center,
            maxLines = 2
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = stringResource(subtitleList[curr]), textAlign = TextAlign.Center, maxLines = 3)
    }
    Row(
        modifier = Modifier.padding(20.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Spacer(
            modifier = Modifier
                .size(if (curr == 0) 15.dp else 10.dp)
                .clip(
                    shape = CircleShape
                )
                .background(color = if (curr == 0) VIOLET_VIOLET_100 else VIOLET_VIOLET_20)
        )
        Spacer(
            modifier = Modifier
                .padding(horizontal = 10.dp)
                .size(if (curr == 1) 15.dp else 10.dp)
                .clip(
                    shape = CircleShape
                )
                .background(color = if (curr == 1) VIOLET_VIOLET_100 else VIOLET_VIOLET_20)
        )
        Spacer(
            modifier = Modifier
                .size(if (curr == 2) 15.dp else 10.dp)
                .clip(
                    shape = CircleShape
                )
                .background(color = if (curr == 2) VIOLET_VIOLET_100 else VIOLET_VIOLET_20)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true, name = "Onboarding")
@Composable
fun OnboardingPreview() {
    OnboardingScreen()
}
