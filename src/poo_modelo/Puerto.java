/*En un puerto se alquilan amarres para barcos de distinto tipo. Para cada ALQUILER se guarda el nombre y DNI del cliente, la fecha inicial y final de alquiler, la posición del amarre y el barco que lo ocupará.
Un BARCO se caracteriza por su matrícula, su eslora en metros y año de fabricación.
Un alquiler se calcula multiplicando el número de días de ocupación (incluyendo los días inicial y final) por un módulo función de cada barco (obtenido simplemente multiplicando por 10 los metros de eslora) y por un valor fijo (800€). Sin embargo ahora se pretende diferenciar la información de algunos tipos de barcos:
número de mástiles para veleros
potencia en CV para embarcaciones deportivas a motor
potencia en CV y número de camarotes para yates de lujo.
El módulo de los barcos de un tipo especial se obtiene como el módulo normal más:
el número de mástiles para veleros, la potencia en CV para embarcaciones deportivas a motor, la potencia en CV, más el número de camarotes para yates de lujo.

Utilizando la herencia de forma apropiada, diseñe el diagrama de clases y sus relaciones, con detalle de atributos y métodos necesarios. Programe en Java los métodos que permitan calcular el alquiler de cualquier tipo de barco.
*/
public class Puerto {
    Barco barco;
    
}

