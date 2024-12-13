package taller_dir_fil;

import java.io.File;
import java.util.Scanner;

public class TALLER_DIR_FIL {

    public static void main(String[] args) {
        //Variables globales para control de bucles y opciones
        boolean banderita = true;
        int opcion;
        //Scanner para entrada de dato por consola
        Scanner input = new Scanner(System.in);

        //Menú principal
        do {
            System.out.println("-----------------------------------------");
            System.out.println("| 1. DIRECTORIO\t|");
            System.out.println("| 2. INFORMACION\t|");
            System.out.println("| 3. SALIR DE LA APP\t|");
            System.out.println("-----------------------------------------");
            System.out.print("OPCION: ");
            opcion = input.nextInt();
            switch (opcion) {
                case 1 -> {
                    //método menu1
                    menu1(input);
                    break;
                }
                case 2 -> {
                    //método menu2
                    menu2(input);

                }
                case 3 -> {
                    System.out.println("Saliendo de la App");
                    banderita = false;
                    break;
                }
            }
        } while (banderita);
    }

    //métodos
    //1. NUEVO DIRECTORIO RAIZ
    public static void menu1(Scanner input) {
        boolean banderita2 = true;
        int opcion2;
        while (banderita2) {
            System.out.println("1. CREAR DIRECTORIO");
            System.out.println("2. CAMBIAR NOMBRE DE DIRECTORIO");
            System.out.println("3. REGRESAR");
            System.out.print("OPCION: ");
            opcion2 = input.nextInt();
            switch (opcion2) {
                case 1 -> {
                    //funcion para crear directorio
                    System.out.print("Ingrese nombre de directorio: ");
                    input.nextLine();
                    String nombre_directorio = input.nextLine();
                    crear_directorio(input, nombre_directorio);
                    break;
                }
                case 2 -> {
                    System.out.print("Ingrese el nombre de directorio que desea renombrar: ");
                    input.nextLine();
                    String nombre_directorio = input.nextLine();
                    cambiar_nombre_directorio(input, nombre_directorio);
                    break;
                }
                case 3 ->{
                    System.out.println("Regresando al menu principal");
                    banderita2 = false;
                    break;
                }
            }
        }
    }
    
    //Crear directorio
    public static void crear_directorio(Scanner input, String nd) {
        File documento = new File("C:\\Users\\AlexDev\\Desktop\\" + nd);
        if (documento.exists()) {
            System.out.println("Directorio: " + documento.getName() + " ya existe.");
        } else {
            System.out.println("Deseas crear un nuevo directorio bajo el nombre: " + documento.getName());
            String si_no = input.nextLine();
            if (si_no.equalsIgnoreCase("si")) {
                documento.mkdir();
            } else {
                System.out.println("No se pudo crear el directorio");
            }
        }
    }

    //Cambiar nombre de  directorio
    public static void cambiar_nombre_directorio(Scanner input, String nd) {
        File documento = new File("C:\\Users\\AlexDev\\Desktop\\" + nd);
        if(documento.exists()){
            System.out.println("Si existe el fichero: "+documento.getName()+" en la ruta "+documento.getPath());
            System.out.println("Ingresa el nuevo nombre: ");
            String nuevo_nombre_directorio = input.nextLine();
            File documento_n = new File("C:\\Users\\AlexDev\\Desktop\\"+nuevo_nombre_directorio);
            documento.renameTo(documento_n);
        }else{
            System.out.println("No existe el directorio: "+documento.getName());
        }
    }

    public static void menu2(Scanner input){
        boolean banderita3 = true;
        int opcion3;
        while (banderita3) {
            System.out.println("1. CREAR SUBDIRECTORIO");
            System.out.println("2. CAMBIAR NOMBRE DE SUBDIRECTORIO");
            System.out.println("3. ARCHIVO EN SUBDIRECTORIO");
            System.out.println("4. REGRESAR");
            System.out.print("OPCION: ");
            opcion3 = input.nextInt();
            switch (opcion3) {
                case 1 -> {
                    //funcion para crear directorio
                    System.out.print("Ingrese nombre de directorio padre: ");
                    input.nextLine();
                    String nombre_directorio = input.nextLine();
                    crear_subdirectorio(input, nombre_directorio);
                    break;
                }
                case 2 -> {
                    System.out.print("Ingrese el nombre de directorio padre: ");
                    input.nextLine();
                    String nombre_directorio = input.nextLine();
                    cambiar_nombre_subdirectorio(input, nombre_directorio);
                    break;
                }
                case 3 ->{
                    System.out.print("Ingrese el nombre del subdirectorio donde desea crear el archivo: ");
                    input.nextLine();
                    String nombre_directorio = input.nextLine();
                    menu3(input, nombre_directorio);
                    break;
                }
                case 4 ->{
                    System.out.println("Regresando al menu anterior");
                    banderita3 = false;
                    break;
                }
            }
        }
    }
    
       public static void menu3(Scanner input, String nd){
        boolean banderita4 = true;
        int opcion4;
        while (banderita4) {
            System.out.println("1. CREAR ARCHIVO");
            System.out.println("2. CAMBIAR NOMBRE DE ARCHIVO");
            System.out.println("3. ELIMINAR ARCHIVO");
            System.out.println("4. REGRESAR");
            System.out.print("OPCION: ");
            opcion4 = input.nextInt();
            switch (opcion4) {
                case 1 -> {
                    //funcion para crear directorio
                    System.out.print("Ingrese nombre de archivo: ");
                    input.nextLine();
                    String nombre_directorio = input.nextLine();
                    crear_archivo_en_subdirectorio(input, nombre_directorio);
                    break;
                }
                case 2 -> {
                    System.out.print("Ingrese el nombre de archivo que desea renombrar: ");
                    input.nextLine();
                    String nombre_archivo = input.nextLine();
                    cambiar_nombre_archivo(input, nombre_archivo);
                    break;
                }
                case 3 ->{
                    System.out.print("Ingrese el nombre de archivo que desea eliminar: ");
                    input.nextLine();
                    String nombre_archivo = input.nextLine();
                    eliminar_archivo(input, nombre_archivo);
                    break;
                }
                case 4 ->{
                    System.out.println("Regresando al menu anterior");
                    banderita4 = false;
                    break;
                }
            }
        }
    }
       
       
       //Menu 4
       //(Archivo)
       
       
       
       
    

        //CREAR SUBDIRECTORIO
    public static void crear_subdirectorio(Scanner input, String nd) {
         File documento = new File("C:\\Users\\AlexDev\\Desktop\\"+nd);
        if (documento.exists()) {
            System.out.println("Directorio: " + documento.getName() + " existe.");
            System.out.println("Ingresa el nombre del subdirectorio para: "+documento.getName());
            String nnd = input.nextLine();
            File documento2 = new File("C:\\Users\\AlexDev\\Desktop\\"+nd+"\\"+nnd);
            System.out.println("Deseas crearlo: (si/no)");
            String si_no = input.nextLine();
            if (si_no.equalsIgnoreCase("si")) {
                documento2.mkdir();
            } else {
                System.out.println("No se pudo crear el subdirectorio");
            }
        } else {
            System.out.println("No existe el directorio, vuelve a intentarlo");
        }
    }

    //CAMBIAR NOMBRE DE SUBDIRECTORIO
    public static void cambiar_nombre_subdirectorio(Scanner input, String nd) {
        File documento = new File("C:\\Users\\AlexDev\\Desktop\\"+nd+"\\");
        if(documento.exists()){
            System.out.println("Si existe el directorio: "+documento.getName()+" en la ruta "+documento.getPath());
            System.out.println("Ingresa el nombre del subdirectorio que deseas renombrar: ");
            input.nextLine(); // Limpiar buffer porque genera salto
            String nombre_actual_subdirectorio = input.nextLine();
            File subdirectorio_actual = new File(documento, nombre_actual_subdirectorio);
            if (subdirectorio_actual.exists() && subdirectorio_actual.isDirectory()) {
            System.out.println("Ingresa el nuevo nombre del subdirectorio: ");
            String nuevo_nombre_subdirectorio = input.nextLine();
            File nuevo_subdirectorio = new File(documento, nuevo_nombre_subdirectorio);
            if (subdirectorio_actual.renameTo(nuevo_subdirectorio)) {
                System.out.println("Subdirectorio renombrado exitosamente a: " + nuevo_nombre_subdirectorio);
            } else {
                System.out.println("Error al renombrar el subdirectorio.");
            }
        } else {
            System.out.println("El subdirectorio especificado no existe.");
        }
    } else {
        System.out.println("No existe el directorio: " + documento.getName());
    }
    }
    
    //CREAR ARCHIVO EN SUBCARPETA
    public static void crear_archivo_en_subdirectorio(Scanner input, String nd) {
        File subdirectorio = new File("C:\\Users\\AlexDev\\Desktop\\" + nd);
        if (subdirectorio.exists() && subdirectorio.isDirectory()) {
            System.out.println("El subdirectorio " + subdirectorio.getName() + " existe.");
            System.out.print("Ingrese el nombre del archivo a crear (con extensión, por ejemplo: archivo.txt): ");
            String nombre_archivo = input.nextLine();
            File archivo = new File(subdirectorio, nombre_archivo);

            // Verificar si el archivo ya existe antes de crearlo
            if (archivo.exists()) {
                System.out.println("El archivo ya existe: " + archivo.getName());
            } else {
                // Intentar crear el archivo y verificar si fue exitoso
                if (archivo.mkdir() || archivo.isFile() || archivo.setWritable(true)) {
                    System.out.println("Archivo creado exitosamente: " + archivo.getName());
                } else {
                    System.out.println("No se pudo crear el archivo. Verifica los permisos o el nombre.");
                }
            }
        } else {
            System.out.println("El subdirectorio no existe. Por favor, verifica la ruta.");
        }
    }

    
    //CAMBIAR NOMBRE DE ARCHIVO
    public static void cambiar_nombre_archivo(Scanner input, String na) {
        File archivo = new File("C:\\Users\\AlexDev\\Desktop\\" + na);
        if (archivo.exists() && archivo.isFile()) {
            System.out.println("Archivo encontrado: " + archivo.getName() + " en la ruta: " + archivo.getPath());
            System.out.print("Ingrese el nuevo nombre para el archivo (con extensión, por ejemplo: nuevo_nombre.txt): ");
            String nuevo_nombre = input.nextLine();
            File nuevo_archivo = new File(archivo.getParent(), nuevo_nombre);
            if (archivo.renameTo(nuevo_archivo)) {
                System.out.println("Archivo renombrado exitosamente a: " + nuevo_nombre);
            } else {
                System.out.println("Error al renombrar el archivo.");
            }
        } else {
            System.out.println("El archivo no existe o la ruta es incorrecta.");
        }
    }
    
    //ELIMINAR ARCHIVO
    public static void eliminar_archivo(Scanner input, String na) {
        File archivo = new File("C:\\Users\\AlexDev\\Desktop\\" + na);
        if (archivo.exists() && archivo.isFile()) {
            System.out.print("?Está seguro que desea eliminar el archivo " + archivo.getName() + "? (si/no): ");
            String confirmacion = input.nextLine();
            if (confirmacion.equalsIgnoreCase("si")) {
                if (archivo.delete()) {
                    System.out.println("Archivo eliminado exitosamente.");
                } else {
                    System.out.println("Error al eliminar el archivo.");
                }
            } else {
                System.out.println("Eliminación cancelada.");
            }
        } else {
            System.out.println("El archivo no existe o la ruta es incorrecta.");
        }
    }
}