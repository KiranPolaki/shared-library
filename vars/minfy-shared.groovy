def call(){
  sh '''
  python3 -m venv $VENV
  . $VENV/bin/activate
  pip install --upgrade pip
  pip install -r requirements.txt wheel
  '''
}
