package br.senai.sp.jandira.BMI.UserDataScreens

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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Balance
import androidx.compose.material.icons.filled.Height
import androidx.compose.material.icons.filled.Numbers
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.bmi.R


@Composable
fun UserDataScreen(controleDeNavegacao: NavHostController?) {

    var nomeState = remember {
        mutableStateOf(value = "")
    }

    var nome = ""

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    listOf(
                        Color(0xff270050),
                        Color(0xff6700F5)
                    )
                )
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
        ) {
            Text(
                text = stringResource(R.string.hi),
                fontSize = 34.sp,
                color = Color.White,
                modifier = Modifier
                    .weight(1f)
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
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(32.dp),
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Column(
                            modifier = Modifier
                                .weight(1f),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Card(
                                modifier = Modifier
                                    .size(160.dp),
                                shape = CircleShape,
                                border = BorderStroke(
                                    width = 2.dp,
                                    brush = Brush.horizontalGradient(
                                        listOf(
                                            Color(0xff6700F5),
                                            Color(0xFFA769FF),
                                            Color(0xff6700F5)
                                        )
                                    )
                                )
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.man),
                                    contentDescription = ""
                                )
                            }
                            Button(
                                onClick = {},
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(
                                        0xFF6D21D5
                                    )
                                ),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(
                                        horizontal = 8.dp,
                                        vertical = 8.dp

                                    )
                            )
                            {
                                Text(
                                    text = stringResource(R.string.male)
                                )
                            }
                        }
                        Column(
                            modifier = Modifier
                                .weight(1f),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Card(
                                modifier = Modifier
                                    .size(160.dp),
                                shape = CircleShape,
                                border = BorderStroke(
                                    width = 2.dp,
                                    brush = Brush.horizontalGradient(
                                        listOf(
                                            Color(0xff6700F5),
                                            Color(0xFFA769FF),
                                            Color(0xff6700F5)
                                        )
                                    )
                                )
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.woman),
                                    contentDescription = ""
                                )
                            }
                            Button(
                                onClick = {},
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(
                                        0xFF6D21D5
                                    )
                                ),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(
                                        horizontal = 8.dp,
                                        vertical = 8.dp
                                    )
                            ) {
                                Text(
                                    text = stringResource(R.string.female)
                                )
                            }
                        }
                    }
                    Column(
                        modifier = Modifier
                            .padding(top = 50.dp)
                            .height(350.dp)
                            .fillMaxSize(),
                        horizontalAlignment = Alignment.Start
                    ){
                        OutlinedTextField(
                            value = nomeState.value,
                            onValueChange = {
                                nomeState.value = it
                            },
                            label = {
                                Text(
                                    text = stringResource(R.string.age)
                                )
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 16.dp),
                            shape = RoundedCornerShape(13.dp),
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Numbers,
                                    contentDescription = "",
                                    tint = Color(0xFF6D21D5)
                                )
                            },
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Number,
                                imeAction = ImeAction.Next,
                                capitalization = KeyboardCapitalization.Words
                            )
                        )
                        OutlinedTextField(
                            value = nomeState.value,
                            onValueChange = {
                                nomeState.value = it
                            },
                            label = {
                                Text(
                                    text = stringResource(R.string.weight)
                                )
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 16.dp),
                            shape = RoundedCornerShape(13.dp),
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Balance,
                                    contentDescription = "",
                                    tint = Color(0xFF6D21D5)
                                )
                            },
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Number,
                                imeAction = ImeAction.Next,
                                capitalization = KeyboardCapitalization.Words
                            )
                        )
                        OutlinedTextField(
                            value = nomeState.value,
                            onValueChange = {
                                nomeState.value = it
                            },
                            label = {
                                Text(
                                    text = stringResource(R.string.height)
                                )
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 16.dp),
                            shape = RoundedCornerShape(13.dp),
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Height,
                                    contentDescription = "",
                                    tint = Color(0xFF6D21D5)
                                )
                            },
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Number,
                                imeAction = ImeAction.Done,
                                capitalization = KeyboardCapitalization.Words
                            )
                        )
                        HorizontalDivider(
                            modifier = Modifier
                                .padding(top = 20.dp)
                        )
                        Button(
                            onClick = {
                                controleDeNavegacao?.navigate("result")
                            },
                            shape = RoundedCornerShape(15.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color  (0xFF6D21D5)),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 15.dp)
                        ){
                            Text(
                                text = stringResource(R.string.calculate),
                            )
                        }
                    }
                }
            }
        }
    }
}
@Preview(showSystemUi = true)
@Composable
private fun UserDataScreenPreview() {
    UserDataScreen(null)
}

