package com.example.android.quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.Alignment
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
                    Quadrant(
                        stringResource(R.string.first_quadrant_title),
                        stringResource(R.string.first_quadrant_content),
                        stringResource(R.string.second_quadrant_title),
                        stringResource(R.string.second_quadrant_content),
                        stringResource(R.string.third_quadrant_title),
                        stringResource(R.string.third_quadrant_content),
                        stringResource(R.string.fourth_quadrant_title),
                        stringResource(R.string.fourth_quadrant_content))
                }
            }
        }
    }
}

@Composable
fun GreenBox(firstQuadrantTitle: String, firstQuadrantContent: String){
    Box(
        modifier = Modifier
            .background(Color.Green)
            .fillMaxWidth(0.5f)
            .fillMaxHeight(0.5f)
    ) {
        Column(modifier = Modifier
            .padding(16.dp)
        ) {
            Text(text = firstQuadrantTitle,
                textAlign = TextAlign.Justify,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp))
            Text(text = firstQuadrantContent, textAlign = TextAlign.Justify)
        }

    }
}

@Composable
fun YellowBox(secondQuadrantTitle: String, secondQuadrantContent: String){
    Box(
        modifier = Modifier
            .background(Color.Yellow)
            .fillMaxWidth()
            .fillMaxHeight(0.5f)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = secondQuadrantTitle,
                textAlign = TextAlign.Justify,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp))
            Text(text = secondQuadrantContent, textAlign = TextAlign.Justify)
        }
    }
}

@Composable
fun CyanBox(thirdQuadrantTitle: String, thirdQuadrantContent: String){
    Box(
        modifier = Modifier
            .background(Color.Cyan)
            .fillMaxWidth(0.5f)
            .fillMaxHeight()
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = thirdQuadrantTitle,
                textAlign = TextAlign.Justify,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp))
            Text(text = thirdQuadrantContent, textAlign = TextAlign.Justify)
        }

    }
}

@Composable
fun LightGrayBox(fourthQuadrantTitle: String, fourthQuadrantContent: String){
    Box(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Column(modifier = Modifier.padding(16.dp)){
            Text(text = fourthQuadrantTitle,
                textAlign = TextAlign.Justify,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp))
            Text(text = fourthQuadrantContent, textAlign = TextAlign.Justify)
        }

    }
}



@Composable
fun Quadrant(firstQuadrantTitle: String, firstQuadrantContent: String,
             secondQuadrantTitle: String, secondQuadrantContent: String,
             thirdQuadrantTitle: String, thirdQuadrantContent: String,
             fourthQuadrantTitle: String, fourthQuadrantContent: String) {

    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.Top
        ) {
            GreenBox(firstQuadrantTitle, firstQuadrantContent)
            YellowBox(secondQuadrantTitle, secondQuadrantContent)
        }

        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.Bottom
        ) {
            CyanBox(thirdQuadrantTitle, thirdQuadrantContent)
            LightGrayBox(fourthQuadrantTitle, fourthQuadrantContent)
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
                        .fillMaxHeight(0.5f)
                )


                QuadrantCard(
                    color = Color.Yellow,
                    header = stringResource(id = R.string.second_quadrant_title),
                    body = stringResource(id = R.string.second_quadrant_content),
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.5f)
                )

        }
        Row(modifier = modifier.fillMaxWidth()) {

                QuadrantCard(
                    color = Color.Cyan,
                    header = stringResource(id = R.string.third_quadrant_title),
                    body = stringResource(id = R.string.third_quadrant_content),
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .fillMaxHeight()
                )


                QuadrantCard(
                    color = Color.LightGray,
                    header = stringResource(id = R.string.fourth_quadrant_title),
                    body = stringResource(id = R.string.fourth_quadrant_content),
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                )

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
            ) {
                Text(text = header,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(vertical = 8.dp))
                Text(text = body,
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(vertical = 20.dp)
                    )
        }

    }
}


@Preview(showBackground = true)
@Composable
fun QuadrantPreview() {
    QuadrantTheme {
        QuadrantBox()
//        Quadrant(
//            stringResource(R.string.first_quadrant_title),
//            stringResource(R.string.first_quadrant_content),
//            stringResource(R.string.second_quadrant_title),
//            stringResource(R.string.second_quadrant_content),
//            stringResource(R.string.third_quadrant_title),
//            stringResource(R.string.third_quadrant_content),
//            stringResource(R.string.fourth_quadrant_title),
//            stringResource(R.string.fourth_quadrant_content))
    }
}