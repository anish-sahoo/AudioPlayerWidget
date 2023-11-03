package com.anish.audiowidget

import android.appwidget.AppWidgetProvider
import android.widget.MediaController
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
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
    Row {
        // Display the play/pause button.
        Button(onClick = {}) {
            Text("Play")
        }

        // Display the pause button.
        Button(onClick = {}) {
            Text("Pause")
        }

        // Display the next track button.
        Button(onClick = {}) {
            Text("Next")
        }

        // Display the previous track button.
        Button(onClick = {}) {
            Text("Previous")
        }
    }
}
