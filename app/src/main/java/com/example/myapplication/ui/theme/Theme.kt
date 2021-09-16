package com.example.myapplication.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
  primary = PrimaryPurple80,
  secondary = SecondaryPurple80,
  tertiary = TertiaryPink80
)

private val LightColorScheme = lightColorScheme(
  primary = PrimaryPurple40,
  secondary = SecondaryPurple40,
  tertiary = TertiaryPink40

  /* Other default colors to override
    background = Color(red = 255, green = 251, blue = 254),
    surface = Color(red = 255, green = 251, blue = 254),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(red = 28, green = 27, blue = 31),
    onSurface = Color(red = 28, green = 27, blue = 31),
    */
)

@Composable
fun MyApplicationTheme(
  darkTheme: Boolean = isSystemInDarkTheme(),
  content: @Composable () -> Unit
) {
  val colorScheme = if (darkTheme) {
    DarkColorScheme
  } else {
    LightColorScheme
  }

  MaterialTheme(
    colorScheme = colorScheme,
    typography = Typography,
    shapes = Shapes,
    content = content
  )
}