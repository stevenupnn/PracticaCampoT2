$git init													inicializar

$git remote add origin "https://github.com/stevenupnn/PracticaCampoT2.git"                                    agregar origen remoto  [LOCAL]
---------------------------------------------------------------------------------------------------------------------------------------------------
$git clone "https://github.com/stevenupnn/PracticaCampoT2.git"							clonar

$cd "ruta"

-----------------------------------HACER UN COMMIT Y PUBLICAMOS-------------------------------------------------------------------------------------
Creamos guia_git.md 

$git add .

$git commit -m "Añadiendo el archivo guia_git.md"

$git push -u origin master											 push -u origen master

------------------------------------------------ CREAMOS RAMAS --------------------------------------------------------------------------------------

$git branch

$git branch ramacasos												CREAMOS ramacasos

$git checkout ramacasos												TRASLADAMOS A LA ramacasos RECIEN CREADA

$git push origin ramacasos												PUBLICAMOS ramacasos

------------------------------------- CREAMOS UN ARCHIVO README EN LA RAMACASOS Y PUBLICAMOS EN LA RAMACASOS ------------------------------------------------

$ echo "Archivo readme" > readme.txt

$git add .

$git commit -m "Añadiendo el archivo readme.txt"

$git push origin ramacasos	

---------------------------------------- COMPARAMOS LA RAMA EN LA QUE ESTAMOS CON LA RAMA QUE QUEREMOS ------------------------------------------------

$git diff ramacasos main																							

---------------------------------------- FUSIONAMOS RAMAS PERO PRIMERO DEBES ESTAR EN LA RAMA PRINCIPAL ------------------------------------------------

$git checkout master

$git merge ramacasos master

$git add . (OPCIONAL)

$git commit -m "Archivo readme aprobado para la rama principal" (OPCIONAL)

$git push origin master	 (OPCIONAL)


