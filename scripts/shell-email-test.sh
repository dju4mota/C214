sudo apt-get install mailutils
echo "Fim da instalacao"
echo "Comeco dos testes" 
echo "email:  $1"
mail -s "Testes no pipeline iniciados" "$1" <<< "Os testes unitarios pelo pipeline comecaram"