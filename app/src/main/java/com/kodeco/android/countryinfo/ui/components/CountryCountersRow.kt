package com.kodeco.android.countryinfo.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.kodeco.android.countryinfo.flow.Flows

@Composable
fun CountryCountersRow(onClick: () -> Unit) {
    val tapValue by Flows.tapFlow.collectAsState()
    val backValue by Flows.backFlow.collectAsState()
    Row(
        Modifier
            .fillMaxWidth()
            .background(Color.Cyan),
        Arrangement.SpaceAround,
        Alignment.CenterVertically,
    ) {
        Text(text = "Taps: $tapValue")
        Button(onClick = onClick) {
            Text(text = "Refresh")
        }
        Text(text = "Back: $backValue")
    }
}

@Preview
@Composable
fun CountryCountersRowPreview() {
    CountryCountersRow(
        onClick = {},
    )
}
