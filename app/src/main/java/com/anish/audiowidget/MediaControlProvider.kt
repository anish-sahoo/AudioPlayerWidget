package com.anish.audiowidget

import android.appwidget.AppWidgetProvider
import android.widget.MediaController
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.anish.audiowidget.ui.theme.AudioWidgetTheme

class MediaControlProvider : AppWidgetProvider() {
    override fun onUpdate(
            context: android.content.Context,
            appWidgetManager: android.appwidget.AppWidgetManager,
            appWidgetIds: IntArray
    ) {
        super.onUpdate(context, appWidgetManager, appWidgetIds)
    }
}

@Preview(showBackground = false)
@Composable
fun Preview() {
    AudioWidgetTheme {
        MediaPlayerWidgetContainer(mediaController = null)
    }
}

@Composable
fun MediaPlayerWidgetContainer(mediaController: MediaController?) {
    // Display the media controller widget with the MediaController instance.
    MediaPlayerWidget(mediaController)
}

@Composable
fun MediaPlayerWidget(mediaController: MediaController?) {

    Column(Modifier.padding(8.dp)) {
        // Display the title of the current track.
        Row{
            Box(
                modifier = Modifier.size(50.dp, 50.dp).padding(end = 4.dp).clip(RoundedCornerShape(10.dp)).background(Color.White)
            )
            Column(Modifier.padding(0.dp, 0.dp, 2.dp, 0.dp)){
                Text(
                    text = "Song Name",
                    color = Color.White,
                    fontFamily = androidx.compose.ui.text.font.FontFamily.SansSerif
                )
                Text(
                    text = "Artist",
                    color = Color.White,
                    fontSize = 10.sp,
                    fontFamily = androidx.compose.ui.text.font.FontFamily.SansSerif
                )
            }
        }


        Row(Modifier.padding(0.dp, 2.dp, 2.dp, 0.dp)){
            // Display the previous track button.

            Button(
                onClick = {},
                Modifier.padding(end = 2.dp)
            ) {
                Icon(Icons.Filled.KeyboardArrowLeft, "")
            }
            // Display the play/pause button.
            Button(
                onClick = {}
            ) {
                Icon(Icons.Filled.PlayArrow, contentDescription = null)
            }
            // Display the next track button.
            Button(
                onClick = {},
                Modifier.padding(start = 2.dp)
            ) {
                Icon(Icons.Filled.KeyboardArrowRight, contentDescription = null)
            }
        }
    }
}
