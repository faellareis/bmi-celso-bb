package br.senai.sp.jandira.bmi.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.bmi.R

@Composable

fun BMIResultScreen(navController: NavHostController?) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.linearGradient(
                    listOf(
                        Color(0xFFA5EEC3),
                        Color(0xFFE7E528)
                    )
                )
            ),
        contentAlignment = Alignment.BottomCenter
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(40.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = stringResource(R.string.bmi_result),
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 32.dp)
                    .weight(1f),
            )
        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(720.dp),
            shape = RoundedCornerShape(
                topStart = 32.dp,
                topEnd = 32.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(25.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                )
                {
                    Column(
                        modifier = Modifier
                            .weight(1f),
                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {
                        Card(
                            modifier = Modifier
                                .size(150.dp),
                            shape = CircleShape,
                            border = BorderStroke(
                                width = 6.dp,
                                brush = Brush.horizontalGradient(
                                    listOf(
                                        Color(0xFFA5EEC3),
                                        Color(0xFFE7E528)
                                    )
                                )
                            ),
                            elevation = CardDefaults
                                .cardElevation(2.dp)
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxSize(),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    text = stringResource(R.string.number),
                                    color = Color(0xFF000000),
                                    fontSize = 55.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(25.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = stringResource(R.string.class_obesity),
                                color = Color(0xFF000000),
                                fontSize = 25.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Card(
                                modifier = Modifier
                                    .padding(16.dp)
                                    .height(85.dp)
                                    .width(690.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color(0xFFB3DAB3),
                                )
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(16.dp),

                                ) {
                                    Column(
                                        modifier = Modifier
                                            .weight(1f),
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Text(
                                            text = stringResource(R.string.age_result),
                                            fontSize = 20.sp,
                                        )
                                        Text(
                                            text = stringResource(R.string.age_50),
                                            fontSize = 21.sp,
                                            fontWeight = FontWeight.Bold
                                        )
                                    }
                                    VerticalDivider()
                                    Column(
                                        modifier = Modifier
                                            .weight(1f),
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Text(
                                            text = stringResource(R.string.weight_result),
                                            fontSize = 20.sp,
                                        )
                                        Text(
                                            text = stringResource(R.string.kg),
                                            fontSize = 21.sp,
                                            fontWeight = FontWeight.Bold
                                        )
                                    }
                                    VerticalDivider()
                                    Column(
                                        modifier = Modifier
                                            .weight(1f),
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Text(
                                            text = stringResource(R.string.high),
                                            fontSize = 20.sp,
                                        )
                                        Text(
                                            text = stringResource(R.string.cm),
                                            fontSize = 21.sp,
                                            fontWeight = FontWeight.Bold
                                        )
                                    }
                                }
                            }
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(270.dp)
                            ){

                            }
                            HorizontalDivider()
                            Button(
                                onClick = {
                                    navController?.navigate(
                                        route = "user_data"
                                    )
                                },
                                modifier = Modifier
                                    .padding(horizontal = 16.dp)
                                    .fillMaxWidth(),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(0xFFA5EEC3)
                                )

                            ) {
                                Text(
                                    text = stringResource(R.string.new_calc),
                                    color = Color.Black,
                                    fontSize = 18.sp
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

    @Preview(showSystemUi = true)
    @Composable
    private fun BMIResultScreenPreview() {
        BMIResultScreen(null)
    }