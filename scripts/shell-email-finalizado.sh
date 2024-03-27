sudo apt-get install mailutils
echo "Fim da instalacao"
echo "Pipeline Finalizado" 
mail -s "Pipeline Finalizado" ${vars.EMAILDESTINATARIO} <<< "O Pipeline com testes unitarios e build foi finalizado com sucesso"