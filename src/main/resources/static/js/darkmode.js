const btn = document.getElementById('toggle-dark-mode');

// ページ読み込み時に状態を復元
if(localStorage.getItem('darkMode') === 'enabled'){
  document.body.classList.add('dark-mode');
  btn.textContent = '☀️';
}

btn.addEventListener('click', () => {
  document.body.classList.toggle('dark-mode');
  const isDark = document.body.classList.contains('dark-mode');
  localStorage.setItem('darkMode', isDark ? 'enabled' : 'disabled');
  btn.textContent = isDark ? '☀️' : '🌙';
});
