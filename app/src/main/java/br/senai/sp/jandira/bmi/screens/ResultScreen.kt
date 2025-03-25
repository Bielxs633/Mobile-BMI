package br.senai.sp.jandira.BMI.ResultScreens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.bmi.R


@Composable
fun ResultScreen(controleDeNavegacao: NavHostController?) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    listOf(
                        Color(0xff6700F5),
                        Color(0xff270050)
                    )
                )
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
        ) {
            Text(
                text = stringResource(R.string.BMIresult),
                fontSize = 30.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(horizontal = 32.dp, vertical = 32.dp)
            )
            Card(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(4f),
                shape = RoundedCornerShape(
                    topStart = 48.dp,
                    topEnd = 48.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ){
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Card(
                        modifier = Modifier
                            .size(150.dp)
                            .padding(top = 0.dp),
                        shape = CircleShape,
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        ),
                        border = BorderStroke(
                            width = 4.dp,
                            brush = Brush.horizontalGradient(
                                listOf(
                                    Color(0xff6700F5),
                                    Color(0xFFA769FF),
                                    Color(0xff6700F5),
                                    Color(0xff6700F5),
                                    Color(0xFFA769FF),
                                    Color(0xff6700F5),

                                )
                            )
                        )
                    ){
                        Text(
                            text = stringResource(R.string.imc),
                            fontSize = 40.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            modifier = Modifier
                                .padding(horizontal = 50.dp, vertical = 50.dp)
                        )
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(13.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Text(
                            text = stringResource(R.string.youClass),
                            fontSize = 23.sp,
                            color = Color.Black,
                            modifier = Modifier
                                .padding()
                        )
                    }
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(90.dp)
                            .padding(start = 13.dp, end = 13.dp)
                    ){
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),

                            ) {
                            Column(
                                modifier = Modifier
                                    .weight(3f),
                                horizontalAlignment = Alignment.CenterHorizontally,
                            ) {
                                Text(
                                    text = stringResource(R.string.age),
                                    fontSize = 20.sp,
                                    color = Color.Black,
                                    modifier = Modifier
                                        .padding(top = 5.dp)
                                )
                                Text(
                                    text = stringResource(R.string.ageValue),
                                    fontSize = 20.sp,
                                    color = Color.Black,
                                    modifier = Modifier
                                        .padding(top = 13.dp)
                                )
                            }
                            VerticalDivider()
                            Column(
                                modifier = Modifier
                                    .weight(3f),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = stringResource(R.string.weight),
                                    fontSize = 20.sp,
                                    color = Color.Black,
                                    modifier = Modifier
                                        .padding(top = 5.dp)
                                )
                                Text(
                                    text = stringResource(R.string.weightValue),
                                    fontSize = 20.sp,
                                    color = Color.Black,
                                    modifier = Modifier
                                        .padding(top = 13.dp)
                                )
                            }
                            VerticalDivider()
                            Column(
                                modifier = Modifier
                                    .weight(3f),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = stringResource(R.string.height),
                                    fontSize = 20.sp,
                                    color = Color.Black,
                                    modifier = Modifier
                                        .padding(top = 5.dp)
                                )
                                Text(
                                    text = stringResource(R.string.HeightValue),
                                    fontSize = 20.sp,
                                    color = Color.Black,
                                    modifier = Modifier
                                        .padding(top = 13.dp)
                                )
                            }
                        }
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(250.dp)
                            .padding(30.dp)
                            .background(
                                brush = Brush.verticalGradient(
                                    listOf(
                                        Color(0xff270050),
                                        Color(0xff6700F5),
                                        Color(0xFFA769FF),
                                        Color(0xff6700F5),
                                        Color(0xff270050),
                                    )
                                )
                            )
                    ){}
                    HorizontalDivider(
                        modifier = Modifier
                            .padding(15.dp)
                    )
                    Button(
                        onClick = {
                            controleDeNavegacao?.navigate("home")
                        },
                        shape = RoundedCornerShape(15.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color  (0xFF6D21D5)),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp)
                            .height(50.dp)
                    ){
                        Text(
                            modifier = Modifier,
                            textAlign = TextAlign.Center,
                            text = stringResource(R.string.newCalc),
                            fontWeight = FontWeight.Bold,
                        )
                    }
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun UserDataScreenPreview() {
    ResultScreen(null)
}

