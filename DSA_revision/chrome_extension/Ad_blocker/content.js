function skipAds() {
  const skipButton = document.querySelector('.ytp-ad-skip-button');
  if (skipButton) skipButton.click();

  const video = document.querySelector('video');
  const adContainer = document.querySelector('.ad-showing');
  if (video && adContainer) video.currentTime = video.duration;
}

function removeOverlay() {
  document.querySelectorAll('.ytp-ad-overlay-container, .ytp-ad-image-overlay')
    .forEach(el => el.remove());
}

setInterval(() => {
  chrome.storage.local.get('adBlockEnabled', (data) => {
    if (data.adBlockEnabled ?? true) {
      skipAds();
      removeOverlay();
    }
  });
}, 1000);
