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

//フッターの日付
document.getElementById("year").textContent = new Date().getFullYear();

//目次
const toc = document.querySelector(".toc-fixed");
const toggleBtn = document.querySelector(".toc-toggle");

toggleBtn.addEventListener("click", () => {
  toc.classList.toggle("toc-hidden");

  if (toc.classList.contains("toc-hidden")) {
    toggleBtn.textContent = "+";
  } else {
    toggleBtn.textContent = "−";
  }
});

const tocLinks = document.querySelectorAll(".toc-fixed a");
const headings = document.querySelectorAll(".article h2, .article h3");

window.addEventListener("scroll", () => {
  let current = "";

  headings.forEach(h => {
    const top = h.getBoundingClientRect().top;
    if (top <= 120) {
      current = h.id;
    }
  });

  tocLinks.forEach(link => {
    link.classList.remove("active");
    if (link.getAttribute("href") === "#" + current) {
      link.classList.add("active");
    }
  });
});
