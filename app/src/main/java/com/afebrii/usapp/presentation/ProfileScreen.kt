package com.afebrii.usapp.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.afebrii.usapp.R
import com.afebrii.usapp.ui.theme.USAppTheme


@Composable
fun ProfileScreen() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painterResource(R.drawable.profil),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape)
        )
        Text(
            stringResource(R.string.username),
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            style = MaterialTheme.typography.titleSmall,
            modifier = Modifier
                .padding(4.dp)
        )
        Text(
            stringResource(R.string.email),
            fontWeight = FontWeight.Light,
            fontSize = 16.sp,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .padding(4.dp)
        )
        Text(
            stringResource(R.string.univ),
            fontWeight = FontWeight.Light,
            fontSize = 16.sp,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .padding(4.dp)
        )
        Text(
            stringResource(R.string.jurusan),
            fontWeight = FontWeight.Light,
            fontSize = 16.sp,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .padding(4.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun AboutScreenPreview() {
    USAppTheme {
        ProfileScreen()
    }
}