sudo apt-get install mailutils
echo "Fim da instalacao"
echo "Pipeline Finalizado" 
echo "email:  $email_destinatario"
mail -s "Pipeline Finalizado" "$email_destinatario" <<< "O Pipeline com testes unitarios e build foi finalizado com sucesso"