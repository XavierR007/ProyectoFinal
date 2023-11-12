package com.example.poryectofinal.CarpetaPantallaArticulos.home

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.poryectofinal.R
import androidx.compose.foundation.lazy.LazyColumn

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun PantallaMascotasCatalogo(navController: NavController) {
    Scaffold {
        BodyContentMascotas(navController)
    }
}

@Composable
fun BodyContentMascotas(navController: NavController) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Text(
                text = "Catálogo de Mascotas",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )
        }

        // Aquí estan todas las tarjetas para cada mascota
        item {
            MascotaCard(
                nombre = "Beagle    Q.530.00",
                imagenResId = R.drawable.beagle_perro,
                descripcion = "Un perro muy alegre y cariñoso"
            )
        }
        item {
            MascotaCard(
                nombre = "Bulldog      Q.850.00",
                imagenResId = R.drawable.bulldog_frances_perro,
                descripcion = "El bulldog también conocido como bulldog inglés"
            )
        }
        item {
            MascotaCard(
                nombre = "Doberman      Q.625.00",
                imagenResId = R.drawable.doberman_perro,
                descripcion = " Un perro de compañía, protección y utilidad"
            )
        }
        item {
            MascotaCard(
                nombre = "Labrador      Q.700.00",
                imagenResId = R.drawable.labrador_retriever_perro,
                descripcion = "Esta raza es realmente dócil e inteligente"
            )
        }
        item {
            MascotaCard(
                nombre = "Pastor Aleman     Q640.00",
                imagenResId = R.drawable.pastor_aleman_perro,
                descripcion = "El Pastor Alemán es un compañero de familia cariñoso, leal y de buen carácter que ama a los niños."
            )
        }



        item {
            MascotaCard(
                nombre = "Gato Bengali      Q.320.00",
                imagenResId = R.drawable.gato_bengali_gato,
                descripcion = "Los gatos bengalíes muestran seguridad y confianza en sí mismos y, además, son cariñosos."
            )
        }

        item {
            MascotaCard(
                nombre = "Gato Maine Coon   Q.900.00",
                imagenResId = R.drawable.gato_maine_coon_gato,
                descripcion = "Los maine coon son muy amigables y sociables."
            )
        }

        item {
            MascotaCard(
                nombre = "Gato Persa        Q.530.00",
                imagenResId = R.drawable.gato_persa_gato,
                descripcion = "En términos generales, el gato persa destaca por su carácter tranquilo, cariñoso y más afable que el de otras razas felinas."
            )
        }

        item {
            MascotaCard(
                nombre = "Gato Ragdoll      Q120.00",
                imagenResId = R.drawable.gato_ragdoll_gato,
                descripcion = "Son gatos que se conforman bastante, no son exigentes y toleran la mayoría de las situaciones."
            )
        }

        item {
            MascotaCard(
                nombre = "Gato Siames       Q.420.00",
                imagenResId = R.drawable.gato_siames_gato,
                descripcion = "es encanta jugar y agradecen que haya juguetes por la casa."
            )
        }

        item {
            MascotaCard(
                nombre = "Hamster Campbell  Q.231.00",
                imagenResId = R.drawable.hamster_campbell_hamster,
                descripcion = "Es una especie de pequeño roedor originaria de Rusia y el Norte de China."
            )
        }

        item {
            MascotaCard(
                nombre = "Hamster Chino     Q.120.00",
                imagenResId = R.drawable.hamster_chino_hamster,
                descripcion = " proviene como bien su nombre indica de los desiertos del nordeste de China y Mongolia."
            )
        }

        item {
            MascotaCard(
                nombre = "Hamster Roborowski    Q.120.00",
                imagenResId = R.drawable.hamster_roborowski_haster,
                descripcion = "Los roborovskis son omnívoros, es decir, pueden comer una gran variedad de semillas, frutas y verduras."
            )
        }

        item {
            MascotaCard(
                nombre = "Hamster Ruso      Q.320.00",
                imagenResId = R.drawable.hamster_ruso_haster,
                descripcion = "Es la raza más grande de todas, la menos escurridiza"
            )
        }

        item {
            MascotaCard(
                nombre = "Hamster Sirio     Q.220.00",
                imagenResId = R.drawable.hamster_sirio_hamster,
                descripcion = "No olvides que los niños adoran tocar a los animales"
            )
        }


        item {
            Spacer(modifier = Modifier.height(16.dp))
        }

        // Botón para volver atrás
        item {
            Button(onClick = { navController.popBackStack() }) {
                Text(text = "Volver Atrás")
            }
        }
    }
}

@Composable
fun MascotaCard(nombre: String, imagenResId: Int, descripcion: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
    ) {
        Column(
            modifier = Modifier.clickable { /* Puedes agregar lógica de clic aquí si es necesario */ }
        ) {
            Image(
                painter = painterResource(id = imagenResId),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(230.dp)
            )

            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = nombre,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 4.dp)
                )

                Text(text = descripcion)
            }
        }
    }
}

