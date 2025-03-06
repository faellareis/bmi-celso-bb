package br.senai.sp.jandira.bmi.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmi.R

@Composable
fun UserDataScreen(modifier: Modifier = Modifier){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Brush.linearGradient(
                listOf(
                    Color(0xFFA5EEC3),
                    Color(0xFFE7E528)
                )
            )),
        contentAlignment = Alignment.BottomCenter
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = stringResource(R.string.hi),
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,

            )
        }
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(700.dp),
                    shape = RoundedCornerShape(
                        topStart = 50.dp,
                        topEnd = 50.dp)
                ) {
        }
    }

}
@Preview(showSystemUi = true)
@Composable
private fun UserDataScreenPreview() {
    UserDataScreen()
}