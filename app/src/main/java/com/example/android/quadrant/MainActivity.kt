package com.example.android.quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.android.quadrant.ui.theme.QuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    QuadrantBox()
                }
            }
        }
    }
}



@Composable
fun QuadrantBox(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Row(modifier = Modifier.fillMaxWidth()) {
            QuadrantCard(
                color = Color.Green,
                header = stringResource(id = R.string.first_quadrant_title),
                body = stringResource(id = R.string.first_quadrant_content),
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .fillMaxHeight(0.5f))
            QuadrantCard(
                    color = Color.Yellow,
                    header = stringResource(id = R.string.second_quadrant_title),
                    body = stringResource(id = R.string.second_quadrant_content),
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.5f))
        }
        Row(modifier = modifier.fillMaxWidth()) {
                QuadrantCard(
                    color = Color.Cyan,
                    header = stringResource(id = R.string.third_quadrant_title),
                    body = stringResource(id = R.string.third_quadrant_content),
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .fillMaxHeight())
                QuadrantCard(
                    color = Color.LightGray,
                    header = stringResource(id = R.string.fourth_quadrant_title),
                    body = stringResource(id = R.string.fourth_quadrant_content),
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight())
        }
    }
}

@Composable
fun QuadrantCard(color: Color,
                 header: String,
                 body: String,
                 modifier: Modifier = Modifier) {
    Box(modifier = modifier
        .background(color)
    ) {
        Column(modifier = Modifier
            .background(color)
            .padding(start = 12.dp, end = 12.dp, top = 8.dp)
            ) {
                Text(text = header,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Justify)
                Text(text = body,
                    textAlign = TextAlign.Justify)
        }

    }
}


@Preview(showBackground = true)
@Composable
fun QuadrantPreview() {
    QuadrantTheme {
        QuadrantBox()
    }
}