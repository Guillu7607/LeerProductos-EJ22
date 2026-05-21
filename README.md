# Resumen
Este proyecto consiste en una aplicación de consola en Java diseñada para la ingesta y desestructuración de datos comerciales. El objetivo principal del ejercicio es aprender a leer un archivo de texto plano donde la información está organizada por filas y columnas separadas por comas (formato estilo CSV), fragmentando cada línea en componentes individuales (tokens) para su posterior tratamiento y conversión de tipos.

## Características
Lectura Secuencial por Búfer: Utiliza BufferedReader para procesar el archivo línea por línea de manera eficiente, optimizando el consumo de memoria RAM.

Segmentación de Cadenas (Parsing): Implementa el método .split(",") de la clase String para trocear el texto basándose en un carácter delimitador específico.

Conversión de Tipos Dinámica: Transforma datos de texto plano en tipos numéricos primitivos de punto flotante utilizando Double.parseDouble().

Cierre Automático de Recursos: Usa la estructura try-with-resources para garantizar que el archivo se cierre correctamente al finalizar la lectura o en caso de error.
